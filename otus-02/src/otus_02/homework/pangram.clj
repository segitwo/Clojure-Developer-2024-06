(ns otus-02.homework.pangram
  (:require [clojure.string :as string]))


(defn is-pangram [test-string]
  (let [start-alpabet-code 97
        end-alphabet-code 123
        test-string-alphabet (string/join (sort (distinct (string/lower-case (string/replace test-string #"[^\w]" "")))))
        alphabet (string/join (map char (range start-alpabet-code end-alphabet-code)))]
    (= test-string-alphabet alphabet)))
