(defproject {{ns-name}} "0.1.0"
  :description "{{ns-name}}"
  :url "http://gitlab/{{ns-name}}"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring-mock "0.1.5"]
                 [ring-middleware-format "0.3.2"]
                 [com.duelinmarkers/ring-request-logging "0.2.0"]
                 [compojure "1.1.8"]]
  :plugins [[lein-autoexpect "1.0"]])
