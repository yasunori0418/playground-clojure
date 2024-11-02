(ns playground-clojure.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(comment (foo "iced"))

(defn sum [ls]
  (apply + ls))
