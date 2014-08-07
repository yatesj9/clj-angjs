(ns {{ns-name}}.server.development
    (:require [clojure.tools.logging           :as log]
              [{{ns-name}}.config          :refer [get-settings]]
              [{{ns-name}}.routes          :refer [app]]
              [compojure.handler               :as handler]
              [ring.middleware.format          :refer [wrap-restful-format]]
              [com.duelinmarkers.ring-request-logging :refer (wrap-request-logging)])
    (:use [ring.adapter.jetty :only (run-jetty)]))

(defn- start-thread
  [routes port]
  (.start (Thread. #(run-jetty routes
                               {:port port
                                :join? false}))))

(defn- start
  [{:keys [routes port]}]
  (log/info (str "Starting Server...."))
  (start-thread routes port))

(defn make-stack
  [mode]
  (-> app
      (handler/api)
      (wrap-restful-format :format [:json-kw])
      (wrap-request-logging)))

(defn start-server
  []
  (start {:port (get-settings :server :port) :routes (make-stack :development)}))
