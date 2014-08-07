(ns leiningen.new.clj-angjs
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "clj-angjs"))

(defn clj-angjs
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["src/{{sanitized}}/config.clj" (render "config.clj" data)]
["test/{{sanitized}}/tests/server/development_tests.clj" (render "development_tests.clj" data)]
["src/{{sanitized}}/routes.clj" (render "routes.clj" data)]
["src/{{sanitized}}/server/development.clj" (render "development.clj" data)]
["test/{{sanitized}}/core_test.clj" (render "core_test.clj" data)]
["project.clj" (render "project.clj" data)]
["test/{{sanitized}}/tests/config_tests.clj" (render "config_tests.clj" data)]
["src/{{sanitized}}/core.clj" (render "core.clj" data)]
["resources/log4j.properties" (render "log4j.properties")]
)))