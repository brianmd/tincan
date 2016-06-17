(ns user
  (:require [mount.core :as mount]
            [tincan.figwheel :refer [start-fw stop-fw cljs]]
            tincan.core))

(defn start []
  (mount/start-without #'tincan.core/repl-server))

(defn stop []
  (mount/stop-except #'tincan.core/repl-server))

(defn restart []
  (stop)
  (start))


