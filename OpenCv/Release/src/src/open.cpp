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


int main(int argc,char** argv){

	IplImage* img = cvLoadImage("/home/bruno/Pictures/video-game-dota-2_274789.jpg");
	cvNamedWindow("Example 1 ",0);
	cvShowImage("Example 1 ",img);
	cvWaitKey(0);
	cvReleaseImage(&img);
	cvDestroyWindow("Example 1");

	//showVideo(0,argv[1]);

	cvNamedWindow("Show Video",CV_WINDOW_AUTOSIZE);
		CvCapture* capture = cvCreateFileCapture(argv[1]);
		IplImage* frame;

		while(1){
			frame = cvQueryFrame(capture);
			if(!frame)break;
			cvShowImage("Show Video",frame);
			char c = cvWaitKey(33);
			if(c == 27)break;
		}
	return 0;
}
/*void ShowVideo(int agrc, char** argv){

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
*/
