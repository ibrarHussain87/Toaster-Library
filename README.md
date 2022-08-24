{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue-Bold;\f1\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red100\green100\blue100;\red239\green239\blue239;}
{\*\expandedcolortbl;;\cssrgb\c46667\c46667\c46667;\cssrgb\c94902\c94902\c94902;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sa200\partightenfactor0

\f0\b\fs30 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Step 1.
\f1\b0 \'a0Add the JitPack repository to your build file\
\pard\tx566\pardeftab720\partightenfactor0

\fs32 \cf2 allprojects \{\
		repositories \{\
			...\
			maven \{ url 'https://jitpack.io' \}\
		\}\
	\}\cb1 \
\
\pard\pardeftab720\sa200\partightenfactor0

\f0\b\fs40 \cf2 \cb3 \strokec2 Step 2.
\f1\b0 \'a0Add the dependency\cb1 \
\pard\tx566\pardeftab720\partightenfactor0

\fs32 \cf2 \strokec2 ependencies \{\
	        implementation 'com.github.ibrarHussain87:Toaster-Library:Tag'\
	\}\
}