(defproject foo "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :main  ^:skip-aot foo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
