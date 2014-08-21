(ns {{ns-name}}.servers.development
    (:require [{{ns-name}}.config          :refer [get-settings]]
              [{{ns-name}}.routes          :refer [app]]
              [compojure.handler               :as handler]
              [ring.middleware.format          :refer [wrap-restful-format]]
              [com.duelinmarkers.ring-request-logging :refer (wrap-request-logging)]
              [clojure.tools.logging           :as log]
              [ring.server.standalone          :refer [serve]]))

(defn make-stack
  [mode]
  (-> app
      (handler/api)
      (wrap-restful-format :formats [:json-kw])
      (wrap-request-logging)))

(defonce server (atom nil))

(defn start
  [routes & [port]]
  (let [port (if port (Integer/parseInt port) (get-settings :server :port))]
    (reset! server
            (serve routes
                   {:port port
                    :join false}))
    (log/info (str "Starting Dev Server........"))))

(defn stop-server
  []
  (.stop @server)
  (reset! server nil))

(defn start-server
  [& [port]]
  (start (make-stack :development) port))
