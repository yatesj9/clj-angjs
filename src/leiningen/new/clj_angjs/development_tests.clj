(ns {{ns-name}}.tests.server.development-tests
    (:require [{{ns-name}}.server.development :refer [make-stack]])
    (:use [expectations]
          [ring.mock.request]))

(defn handler
  [request]
  {:status 200
   :body "Test Handler"})

(def stack
  (make-stack :development))

; --- Return handler with status of 200 and body of Test Handler--------------
(expect {:status 200 :body "Test Handler"} (handler "my-req"))


