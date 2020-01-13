(ns giggin.helpers)

(defn format-price
  [cents]
  (str " R$" (/ cents 100)))