(defproject {{ns-name}} "0.1.0"
  :description "clj-angjs"
  :url "http://gitlab/{{ns-name}}"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring-mock "0.1.5"]
                 [ring-middleware-format "0.3.2"]
                 [com.duelinmarkers/ring-request-logging "0.2.0"]
                 [compojure "1.1.8"]
                 [log4j/log4j "1.2.17"]
                 [org.slf4j/slf4j-log4j12 "1.7.7"]
                 [org.clojure/tools.logging "0.3.0"]
                 [expectations "2.0.9"]
                 [ring "1.3.0"]]
  :plugins [[lein-autoexpect "1.0"]])
