(ns nyan-as-a-service.views
  (:use [hiccup core page]))

(defn index-page []
  (html5
    [:head
     [:title "Nyan As A Service"]
     (include-css "/stylesheets/application.css")]
    [:body
     [:div {:id "mainContainer"}
      [:div {:id "nyanCat"}
       [:div {:id "wholeHead"}
        [:div {:class "skin ear"}]
        [:div {:class "skin ear rightEar"}]
        [:div {:id "mainHead" :class "skin"}
         [:div {:class "eye"}]
         [:div {:class "eye rightEye"}]
         [:div {:class "nose"}]
         [:div {:class "chick"}]
         [:div {:class "chick rightChick"}]
         [:div {:class "mouth"} "E"]
        ]
       ]
       [:div {:id "toastBody"}
        [:div "&nbsp;  &nbsp; &nbsp;.&nbsp;&nbsp;.&nbsp; &nbsp; &nbsp;..&nbsp;  &nbsp; &nbsp;.&nbsp;.&nbsp; &nbsp; &nbsp;&nbsp&nbsp&nbsp;..&nbsp;  &nbsp; &nbsp;.&nbsp;&nbsp;."]
       ]
       [:div {:id "wholeTail"}
        [:div {:class "tail skin"}]
        [:div {:class "tail middleTail skin"}]
        [:div {:class "tail backTail skin"}]
       ]
       [:div {:id "allYourLegAreBelongToUs"}
        [:div {:class "skin leg back leftBack"}]
        [:div {:class "skin leg back"}]
        [:div {:class "skin leg front leftFront"}]
        [:div {:class "skin leg front"}]
       ]
       [:div {:class "rainbow"}]
       [:div {:class "rainbow r2"}]
       [:div {:class "rainbow r3"}]
       [:div {:class "rainbow r4"}]
      ]
      [:div {:class "star starMovement1"}
       [:div {:number "1"}]
       [:div {:number "2"}]
       [:div {:number "3"}]
       [:div {:number "4"}]
       [:div {:number "5"}]
       [:div {:number "6"}]
       [:div {:number "7"}]
       [:div {:number "8"}]
      ]
      [:div {:class "star starMovement2 backwards"}
       [:div {:number "1"}]
       [:div {:number "2"}]
       [:div {:number "3"}]
       [:div {:number "4"}]
       [:div {:number "5"}]
       [:div {:number "6"}]
       [:div {:number "7"}]
       [:div {:number "8"}]
      ]
      [:div {:class "star starMovement3"}
       [:div {:number "1"}]
       [:div {:number "2"}]
       [:div {:number "3"}]
       [:div {:number "4"}]
       [:div {:number "5"}]
       [:div {:number "6"}]
       [:div {:number "7"}]
       [:div {:number "8"}]
      ]
      [:div {:class "star starMovement4"}
       [:div {:number "1"}]
       [:div {:number "2"}]
       [:div {:number "3"}]
       [:div {:number "4"}]
       [:div {:number "5"}]
       [:div {:number "6"}]
       [:div {:number "7"}]
       [:div {:number "8"}]
      ]
      [:div {:class "star starMovement5"}
       [:div {:number "1"}]
       [:div {:number "2"}]
       [:div {:number "3"}]
       [:div {:number "4"}]
       [:div {:number "5"}]
       [:div {:number "6"}]
       [:div {:number "7"}]
       [:div {:number "8"}]
      ]
     ]
     [:audio {:loop "loop" :autoplay "true" :src "/sounds/nyancat.ogg"}]
     [:script {:type "text/javascript"}
      "document.getElementsByTagName('audio')[0].addEventListener('ended', function(){ this.currentTime = 0; }, false);"
      ]
    ]))
