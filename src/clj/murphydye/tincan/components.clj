(println "loading murphydye.tincan.components")

;; This namespace references all the other components
;; The application can reference solely this namespace
;; without concern for cyclical dependencies

(ns murphydye.tincan.components
  (:require ;
            ;; [murphydye.tincan.websockets.core :as ws]
            [murphydye.tincan.websockets.router :as r]
            [murphydye.tincan.websockets.global :as global]
            [murphydye.tincan.websockets.chatr :as chatr]
            [murphydye.tincan.websockets.stress-test :as stress-test]
            [murphydye.tincan.websockets.dbexplorer :as dbexplorer]
            ))

(defn load-components []
  (r/add @r/root-router :global (global/create-actor :websocket))
  (r/add @r/root-router :chatr (chatr/create-actor :chatr))
  (r/add @r/root-router :stress-test (stress-test/create-actor :stress-test))
  (r/add @r/root-router :dbexplorer (dbexplorer/create-actor :dbexplorer)))

(load-components)

(println "done loading murphydye.components")
