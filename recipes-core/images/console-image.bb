SUMMARY = "A console Snake pi4 image"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"

include recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "package-management"
IMAGE_LINGUAS = "en-us ru-ru"

CORE_OS = " \
    openssh \
    openssh-keygen \
    openssh-sftp-server \
    tzdata \
"

TOOLS_MULTIMEDIA = " \
    ffmpeg \
"

TOOLS_INSTALL = " \
    bzip2 \
    devmem2 \
    dosfstools \
    ethtool \
    fbset \
    findutils \
    iproute2 \
    less \
    memtester \
    netcat \
    procps \
    rsync \
    sysfsutils \
    unzip \
    util-linux \
    zip \
    e2fsprogs-resize2fs \
    nano \
    mc \
    htop \
    tcpdump \
    usbutils \
    pi-bluetooth \
    pciutils \
"

DEV_SDK_INSTALL = " \
    binutils \
    binutils-symlinks \
    coreutils \
    cpp \
    cpp-symlinks \
    diffutils \
    file \
    g++ \
    g++-symlinks \
    gcc \
    gcc-symlinks \
    gdb \
    gdbserver \
    gettext \
    ldd \
    libstdc++ \
    libstdc++-dev \
    libtool \
    make \
    perl-modules \
    pkgconfig \
    python-modules \
"

I2C_TOOLS = " \
    i2c-tools \
"

FONTS = " \
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
"

FONTS_DEV = " \
    fontconfig-dev \
"

TSLIB = " \
    tslib \
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
"

TSLIB_DEV = " \
    tslib-dev \
"

SDR = " \
    asn1c \
    libfftwf \
    fftw-dev \
    libhackrf \
    rtl-sdr \   
    qsweep-srv \
    info-panel \
"

GPS = " \
    pps-tools \
"

AIRNET = " \
    crda \
    iw \
    linux-firmware-rpidistro-bcm43430 \
    linux-firmware-rpidistro-bcm43455 \
    wpa-supplicant \
"

OPENMP = " \
    libgomp \
"

OPENMP_DEV = " \
    libgomp-dev \
    libgomp-staticdev \
"

MQTT = " \
    libmosquitto1 \
    libmosquittopp1 \
    mosquitto \
    mosquitto-clients \
"

PYTHON_UTILS = " \
    python-distutils \
"

MQTT_DEV = " \
    mosquitto-dev \
    python-paho-mqtt \
"

QT_TOOLS = " \
    qtbase \
    qtbase-plugins \
    qtbase-tools \
    qt5-env \
"

QT_DEV_TOOLS = " \
    qtbase-dev \
    qtbase-mkspecs \
"

QT5_DEV_PKGS = " \
    qtcharts-dev \
    qtcharts-mkspecs \
    qtconnectivity-dev \
    qtconnectivity-mkspecs \
    qtdeclarative-dev \
    qtdeclarative-mkspecs \
    qtgraphicaleffects-dev \
    qtlocation-dev \
    qtlocation-mkspecs \
    qtmultimedia-dev \
    qtmultimedia-mkspecs \
    qtquickcontrols2-dev \
    qtquickcontrols2-mkspecs \
    qtsensors-dev \
    qtsensors-mkspecs \
    qtserialbus-dev \
    qtserialbus-mkspecs \
    qtsvg-dev \
    qtsvg-mkspecs \
    qtwebsockets-dev \
    qtwebsockets-mkspecs \
    qtvirtualkeyboard-dev \
    qtxmlpatterns-dev \
    qtxmlpatterns-mkspecs \
    qtserialport-dev \
    qtserialport-mkspecs \
    qtsystems-dev \
    qtsystems-mkspecs \
    qtmqtt-dev \
    qtmqtt-mkspecs \
    qtremoteobjects-dev \
    qtremoteobjects-mkspecs \
    qtgamepad-dev \
    qtgamepad-mkspecs \
    qtlottie-dev \
    qtlottie-mkspecs \
    qtcoap-dev \
    qtcoap-mkspecs \
"
QT5_PKGS = " \
    qtcharts \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtgraphicaleffects \
    qtlocation-plugins \
    qtmultimedia \
    qtmultimedia-plugins \
    qtquickcontrols2 \
    qtsensors-plugins \
    qtserialbus \
    qtserialport \
    qtsystems \
    qtsvg \
    qtwebsockets-qmlplugins \
    qtvirtualkeyboard \
    qtxmlpatterns \
    qtmqtt \
    qtwayland-plugins \
    qtimageformats \
    qtimageformats-plugins \
    qtremoteobjects \
    qtgamepad \
    qtlottie \
    qtcoap \
    qtwebglplugin \
"

IMAGE_INSTALL += " \
    kernel-modules \
    ${CORE_OS} \
    ${TOOLS_INSTALL} \
    ${DEV_SDK_INSTALL} \
    ${I2C_TOOLS} \
    ${FONTS} \
    ${FONTS_DEV} \
    ${TSLIB} \
    ${TSLIB_DEV} \
    ${SDR} \
    ${GPS} \
    ${AIRNET} \
    ${OPENMP} \
    ${OPENMP_DEV} \
    ${MQTT} \
    ${MQTT_DEV} \
    ${QT_TOOLS} \
    ${QT_DEV_TOOLS} \
    ${QT5_DEV_PKGS} \
    ${QT5_PKGS} \
    ${PYTHON_UTILS} \
    ${TOOLS_MULTIMEDIA} \
"

disable_bootlogd() {
    echo BOOTLOGD_ENABLE=no > ${IMAGE_ROOTFS}/etc/default/bootlogd
}

ROOTFS_POSTPROCESS_COMMAND += " \
    disable_bootlogd ; \
 "

export IMAGE_BASENAME = "console-image"
