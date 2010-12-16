(ns Hello.core
    (:gen-class))
  
(defn to-upper
  "Returns string parameter in upper case."
  [string]
  (.toUpperCase string))
  
(defn length
  "Returns string length"
  [string]
  (.length string))

(defn square
  "Squares a number, with side effects."
  [x]
  (println "Squaring" x)
  (println "The return value will be" (* x x)))
  
(defn arg-switch
  "Applies the supplied function to the arguments in both possible orders."
  [fun arg1 arg2]
  (list (fun arg1 arg2) (fun arg2 arg1)))
  
(defn -main [& args]
  (def napis "Hello World!")
  (println napis)
  (println "Dlugosc" napis "to" (length napis))
  (square 4)
  (println "(arg-switch / 2 3) to" (arg-switch / 2 3)
  (println "(arg-switch str \"Hello\" \"World\")" (arg-switch str "Hello" "World"))))