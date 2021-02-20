PACKAGECONFIG_append = " accessibility eglfs fontconfig gles2 linuxfb tslib sql-sqlite"
PACKAGECONFIG_remove = "examples tests"
PACKAGECONFIG_remove_pn-qtwayland = "xcomposite-glx"

DEPENDS += "userland"
