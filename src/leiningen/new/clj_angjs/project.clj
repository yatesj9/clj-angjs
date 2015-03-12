(defproject {{ns-name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.2"]
                 [ring/ring-defaults "0.1.4"]
                 [ring-server "0.4.0"]
                 [hiccup "1.0.5"]]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler {{ns-name}}.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})