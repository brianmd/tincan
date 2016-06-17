(ns tincan.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [tincan.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[tincan started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[tincan has shut down successfully]=-"))
   :middleware wrap-dev})
