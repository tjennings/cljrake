#!/bin/sh
CLASSPATH=classes:src:test

for f in lib/*.jar; do
    CLASSPATH=$CLASSPATH:$f
done

java -cp $CLASSPATH jline.ConsoleRunner clojure.main -e "(use 'rake_for_clojure) (clj-rake-run '($*))"
