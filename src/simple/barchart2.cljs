(ns simple.barchart2
  (:require
            ; ["react-vega-lite" :default VegaLite]
            ; ["react-vega-lite" :as VegaLite]
            ; ["react-vega-lite" :refer (VegaLite)]
            ; ["vega" :default Vega]
            ; ["react-vega-lite" :refer [VegaLite]]
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

(defn example-bar-from-vegalite []
  [:div
    [:h3 "Vega bar chart (from VegaLite)"]
    ; [:>VegaLite {:spec (clj->js bar-chart-spec)
    ;              :data {:values bar-data}}]
   ])
  