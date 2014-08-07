(ns {{ns-name}}.routes
    (:require [compojure.core :refer (context defroutes GET POST)]
              [compojure.route :as route]))

(defn my-handler
  [])

(defroutes app
  (GET "/" [] (my-handler))
  (route/files "/" {:root "public/app"})
  (route/files "/bower_components" {:root "public/bower_components"})
  (route/not-found "Page not found"))
