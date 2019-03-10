(ns csc344-microproject2.core)

(defn simplify [n]
  (let [a (rest (flatten n))]
    (let [b (last a)]
      (cond
        (= (first n)(first a)) b
        (distinct? (rest n)a)true
        (some false? a) true
        (not-every? true? (rest n)) (remove true? (distinct n))
        (every? true? a) false
        (= (count a) 1) (false? b)))))