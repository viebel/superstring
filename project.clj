(defproject str "0.1.0-SNAPSHOT"
  :description "String manipulation library for clojure"
  :url "http://github.com/expez/str"
  :license {:name "MIT License"
            :url "http://www.opensource.org/licenses/mit-license.php"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :plugins [[codox "0.8.11"]]
  :codox {:src-dir-uri "http://github.com/expez/str/blob/master/"
          :src-linenum-anchor-prefix "L"}
  :profiles {:dev {:dependencies [[org.clojure/test.check "0.7.0"]]}})
