# Fix omxplayer: Multiple shlib providers for *
# from private libraries in /usr/lib/omxplayer/
	
PRIVATE_LIBS += "\
    libavcodec.so.58 \
    libavformat.so.58 \
    libavutil.so.56 \
    libswresample.so.3 \
    libswscale.so.5 \
"
