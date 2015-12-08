(set-env! :dependencies '[[org.clojure/clojure "1.7.0"]]
          :source-paths #{"src-java"}
          :resource-paths #{"src-clj"})

(deftask build
  []
  (comp (javac)
        (uber)
        (jar :main 'javaloader.Main)))
