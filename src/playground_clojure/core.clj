(ns playground-clojure.core)

; (defn foo
;   "I don't do a whole lot."
;   [x]
;   (println x "Hello, World!"))

; (comment (foo "iced"))

; (defn sum [ls]
;   (apply + ls))

; ;; https://japan-clojurians.github.io/clojure-site-ja/
; ; マルチアリティ関数
; ; デフォルト引数みたいな感じか
; (defn messenger
;   ([]     (messenger "Hello multi arity function"))
;   ([msg]  (println msg)))
; (messenger)

; ; 可変長引数
; (defn hello [greeting & who]
;   (println greeting who))
; (hello "hello" "world" "class")

; 無名関数
; ((fn [msg] (println msg)) "hello!")

;; これと等価: (fn [x y] (+ x y))
; (#(+ %1 %2) 1 2)

; (defn fizzbuzz
;   [n]
;   (cond
;     (= (rem n 15) 0) "FizzBuzz"
;     (= (rem n 3) 0) "Fizz"
;     (= (rem n 5) 0) "Buzz"
;     :else (str n)))

; (#(println (map fizzbuzz (range 1 101))))

;; map

; (def scores {"Fred" 1400
;              "Bob" 1240
;              "Angela" 1024})
; ;; カンマは空白として使われるらしい
; ;; いわゆるシンタックスシュガー
; (def scores {"Fred" 1400, "Bob" 1240, "Angela" 1024})

