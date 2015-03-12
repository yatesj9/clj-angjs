(ns leiningen.new.clj-angjs
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "clj-angjs"))

(defn clj-angjs
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["src/{{sanitized}}/handler.clj" (render "handler.clj" data)]
["project.clj" (render "project.clj" data)]
["src/{{sanitized}}/repl.clj" (render "repl.clj" data)]
["test/{{sanitized}}/handler_test.clj" (render "handler_test.clj" data)]
["resources/public/app/index.html" (render "index.html")]
["resources/.DS_Store" (render ".DS_Store")]
)))