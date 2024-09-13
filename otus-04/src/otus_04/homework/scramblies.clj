(ns otus-04.homework.scramblies)

;; Оригинальная задача:
;; https://www.codewars.com/kata/55c04b4cc56a697bb0000048

(defn scramble?
  "Функция возвращает true, если из букв в строке letters
  можно составить слово word."
  [letters word]
  nil)

(defn- get-mid [letters]
  (int (/ (count letters) 2)))

(defn- get-char-code-by-idx [letters idx]
  (int (get letters idx)))

(comment
  (def word "world")
  (let [sorted-deduplicated-letters (->> "helloworld" (set) (sort) (vec))
        sorted-deduplicated-letters-mid (get-mid sorted-deduplicated-letters)
        word-first-letter-code (int (first word))
        mid-char-code (get-char-code-by-idx sorted-deduplicated-letters sorted-deduplicated-letters-mid)]
    (> word-first-letter-code mid-char-code)))
