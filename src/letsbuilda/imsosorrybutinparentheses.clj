(ns letsbuilda.imsosorrybutinparentheses)

(def regex-word-replace (re-pattern "(?<!w)[lr](?!w)"))

(defn char-replace [text]
  (clojure.string/replace text regex-word-replace "w"))
