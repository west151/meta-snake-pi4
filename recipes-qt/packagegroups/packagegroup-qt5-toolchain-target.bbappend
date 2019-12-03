USE_WEBENGINE = " \
    qtwebengine-dev \
    qtwebengine-mkspecs \
    qtwebengine \
"
USE_CHARTS = " \
    qtcharts \
    qtcharts-dev \
    qtcharts-mkspecs \
"

USE_QT = " \
    qtmqtt \
    qtmqtt-dev \
    qtmqtt-mkspecs \
    qtremoteobjects \
    qtremoteobjects-dev \
    qtremoteobjects-mkspecs \
    qtpurchasing \
    qtpurchasing-dev \
    qtpurchasing-mkspecs \
    qtgamepad \
    qtgamepad-dev \
    qtgamepad-mkspecs \
    qtlottie \
    qtlottie-dev \
    qtlottie-mkspecs \
    qtcoap \
    qtcoap-dev \
    qtcoap-mkspecs \
"

RDEPENDS_${PN}_remove = " \
    qtwebkit-dev \
    qtwebkit-mkspecs \
    qtwebkit-qmlplugins \
"

RDEPENDS_${PN} += " \
    ${USE_CHARTS} \
    ${USE_QT} \
"
