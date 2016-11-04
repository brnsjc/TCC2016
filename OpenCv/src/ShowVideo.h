/*
 * open.cpp
 *
 *  Created on: May 23, 2016
 *      Author: bruno
 */
#include <opencv2/highgui/highgui.hpp>
#include <opencv/highgui.h>
#include <stdio.h>
#include <iostream>

void showVideo(int argc,char** argv){

	cvNamedWindow("Show Video",CV_WINDOW_AUTOSIZE);
	CvCapture* capture = cvCreateFileCapture(argv[1]);
	IplImage* frame;

	while(1){
		frame = cvQueryFrame(capture);
		if(!frame)break;
		cvShowImage("Show Video",frame);
		char c = cvWaitKey(33);
		if(c ==27)break;

	}

		cvReleaseCapture(&capture);
		cvDestroyWindow("Show Video");

	}



}
