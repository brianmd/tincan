(ns tincan.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [tincan.core-test]))

(doo-tests 'tincan.core-test)

