(ns {{ns-name}}.repl
  (:require [{{ns-name}}.handler :refer [app]])
  (:use [ring.server.standalone]))

(defonce server (atom nil))

(defn get-handler
  []
  (-> #'app))

(defn start-server
  [port]
  (reset! server
    (serve (get-handler) {:port port
                          :open-browser? false})))

(defn stop-server
  []
  (.stop @server))
