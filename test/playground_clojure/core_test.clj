(ns playground-clojure.core-test
  (:require [clojure.test :refer :all]
            [playground-clojure.core :refer :all]))

(deftest sum-test
  (is (= 6 (sum [1 2 3])))
  (is (= 10 (sum [1 2 3 4]))))
 
