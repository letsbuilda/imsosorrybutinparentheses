(ns letsbuilda.imsosorrybutinparentheses-test
  (:require [clojure.test :refer :all]
            [letsbuilda.imsosorrybutinparentheses :refer :all]))

(deftest char-replace-test
  (testing "Replacing 'l' and 'r' with 'w' when not surrounded by 'w'"
    (is (= "hewwo wowwd" (char-replace "hello world"))) ;; basic case
    (is (= "woww" (char-replace "roll")))               ;; both 'r' and 'l' replaced
    (is (= "wawe" (char-replace "rare")))               ;; 'r' in the middle replaced
    (is (= "wlwlwl" (char-replace "wlwlwl")))           ;; no replacements where 'w' is involved
    (is (= "w" (char-replace "l")))                     ;; single character replaced
    (is (= "w" (char-replace "r")))                     ;; single character replaced
    (is (= "" (char-replace "")))                       ;; edge case: empty string
    ))
