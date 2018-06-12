(ns simple.barchart1
  (:require 
;    ["react-vega-lite" :refer (createClassFromLiteSpec)]
   ))

(def bar-data
  (clj->js [{:values
             [{:a "A", :b 20}
              {:a "B", :b 34}
              {:a "C", :b 55}
              {:a "D", :b 19}
              {:a "E", :b 40}
              {:a "F", :b 34}
              {:a "G", :b 91}
              {:a "H", :b 78}
              {:a "I", :b 25}]}]))

(def bar-chart-spec
  {:description "A simple bar chart with embedded data."
   :mark "bar"
   :encoding {:x {:field "a", :type "ordinal"}
              :y {:field "b", :type "quantitative"}}})

; (defn BarChart []
;   (createClassFromLiteSpec "BarChart" bar-chart-spec))


(defn example-bar-from-spec []
  [:div
   [:h3 "Vega bar chart (from spec)"]
    ; [:>BarChart #js {:data bar-data}]
])
