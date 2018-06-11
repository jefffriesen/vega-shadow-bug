(ns simple.core
  (:require [reagent.core :as reagent]
            ))

(defn ui []
  [:div
   [:h1 "Hello world, it is now"]
    ])

(defn render []
  (reagent/render [ui]
                  (js/document.getElementById "app")))

(defn ^:export init []
  (js/console.log "init")
  (render))

