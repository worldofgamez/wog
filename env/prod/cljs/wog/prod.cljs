(ns gamez.prod
  (:require [gamez.client.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
