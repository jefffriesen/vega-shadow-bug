(ns simple.core
  (:require [reagent.core :as reagent]
            [simple.barchart1 :refer [example-bar-from-spec]]
            [simple.barchart2 :refer [example-bar-from-vegalite]]
            ))

(defn ui []
  [:div
   [example-bar-from-spec]
   [example-bar-from-vegalite]
   [:h1 "Hello world, it is now"]
    ])

(defn render []
  (reagent/render [ui]
                  (js/document.getElementById "app")))

(defn ^:export init []
  (js/console.log "init")
  (render))

