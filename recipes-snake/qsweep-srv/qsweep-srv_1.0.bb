SUMMARY = "QSweepserver"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtbase fftwf libhackrf qtmqtt"

PR = "r1"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/west151/qsweep.git"

S = "${WORKDIR}/git"

QMAKE_PROFILES = "${S}/qsweep-srv.pro"

inherit qmake5

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/bin/qsweepserver ${D}${bindir}
}

FILES_${PN} = " \
    ${bindir} \
"
