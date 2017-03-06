#IMGUR UPLOAD

This app is a simple Android application (for Android 4.4 and below) to upload anonymous picture on Imgur with Retrofit 2

## How to use the application

On your first use, this is what you will see :

![](http://i.imgur.com/auWGpJ1.png)

Choose a picture in your Gallery by clicking on ``Browse``

![](http://i.imgur.com/o0KqHS1.png)

Then you can add a title and a description before uploading your picture.

You will get a notification when the upload will start and when it's done : 

![](http://i.imgur.com/QK9fbo1.png)

![](http://i.imgur.com/RcjHG2L.png)


## Development

Lots of the application logic can be found in ``MainActivity``, but if you want to add request to Imgur API, you can look into ``ImgurService`` Interface.

Moreover, the notifications are handled in the ``NotificationHelper``


## Install

To build the project, run :

```bash
gradle build
```

To create the APK :

```bash
gradle assembleRelease
```
