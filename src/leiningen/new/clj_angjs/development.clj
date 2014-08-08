(ns {{ns-name}}.servers.development
    (:require [{{ns-name}}.config          :refer [get-settings]]
              [{{ns-name}}.routes          :refer [app]]
              [{{ns-name}}.servers.common  :refer [start]]
              [compojure.handler               :as handler]
              [ring.middleware.format          :refer [wrap-restful-format]]
              [com.duelinmarkers.ring-request-logging :refer (wrap-request-logging)]))

(defn make-stack
  [mode]
  (-> app
      (handler/api)
      (wrap-restful-format :format [:json-kw])
      (wrap-request-logging)))

(defn start-server
  []
  (start {:port (get-settings :server :port) :routes (make-stack :development)}))
