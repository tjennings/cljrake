(ns rake_for_clojure)

(defn list-tasks []
  (println "Listing tasks!"))

(defn clj-rake-run [args]
  (if (= '-T (first args)) 
    (list-tasks)
    (println "Something else")))

;; Some syntax
;;
;;
;;

`(
  (ns task.build)

  (defn some-helper-fn ...)

  (task compile (:depends_on file_copy fetch_deps)
        (cp ".." "..")
        (some-helper-fn a b c))


  { :task compile
    :depends_on [file_copy fetch_deps ]
    :body [(fn [] (..)(..)) (fn [] (..) (..))]}

  (task jar ...)

  (task "./big_jar.jar" (:depends_on "./classes/something")
        (create "./big_jar.jar"))

  (task compile (:depends_on my_test_task))

  (task compile :list_dependencies)
)
