(ns otus-04.homework.scramblies)

;; Оригинальная задача:
;; https://www.codewars.com/kata/55c04b4cc56a697bb0000048

(defn- get-mid [letters]
  (int (/ (count letters) 2)))

(defn- get-char-code-by-idx [letters idx]
  (int (get letters idx)))

(defn scramble?
  "Функция возвращает true, если из букв в строке letters
  можно составить слово word."
  [letters word]
  (let [word-letters-number (count word)]

    (defn search [letters word-first-letter-code]
      (let [sorted-deduplicated-letters-mid (get-mid letters)
            mid-char-code (get-char-code-by-idx letters sorted-deduplicated-letters-mid)]
        (cond
          (= word-first-letter-code mid-char-code) true
          (> word-first-letter-code mid-char-code) (recur (drop sorted-deduplicated-letters-mid letters)
                                                          word-first-letter-code)
          (< word-first-letter-code mid-char-code) (recur (take sorted-deduplicated-letters-mid letters)
                                                          word-first-letter-code))))

    (let [sorted-deduplicated-letters (->> letters (set) (sort) (vec))]
      (search sorted-deduplicated-letters (int (first word))))))

(comment
  ;;(word-first-letter-code (int (first word)))
  (scramble? "helloworld" "world"))
