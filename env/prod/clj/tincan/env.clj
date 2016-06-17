(ns tincan.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[tincan started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[tincan has shut down successfully]=-"))
   :middleware identity})
