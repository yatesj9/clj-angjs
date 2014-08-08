(ns {{ns-name}}.servers.common
    (:require [clojure.tools.logging :as log])
    (:use [ring.adapter.jetty :only (run-jetty)]))

(defn- start-thread
  [routes port]
  (.start (Thread. #(run-jetty routes
                               {:port port
                                :join? false}))))

(defn start
  [{:keys [routes port]}]
  (log/info (str "Starting Server...."))
  (start-thread routes port))

