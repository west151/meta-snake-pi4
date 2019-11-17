SUMMARY = "info-panel"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI[md5sum] = "7006309d30bf82eaa470d49ddec57f58"
SRC_URI[sha256sum] = "e9ca66c67e32db58ba382c12037c63a0ed1957e342111fffba9cda89167eeea1"

DEPENDS += "qtbase qtquickcontrols2"

PR = "r1"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/west151/info-panel.git"

S = "${WORKDIR}/git"

inherit qmake5

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/bin/info-panel ${D}${bindir}
}

FILES_${PN} = " \
    ${bindir} \
"
