(ns otus-02.homework.palindrome
  (:require [clojure.string :as string]))


(defn is-palindrome [test-string]
  (let [original-string (string/lower-case (string/replace test-string #"[^\w]" ""))
        reversed-string (string/reverse original-string)]
    (= original-string reversed-string)))
