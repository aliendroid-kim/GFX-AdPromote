// Generated by view binder compiler. Do not edit!
package com.gfx.adPromote.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gfx.adPromote.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class YoutubeBannerBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView ad;

  @NonNull
  public final FrameLayout bannerBody;

  @NonNull
  public final RelativeLayout bannerProgress;

  @NonNull
  public final LinearLayout content1;

  @NonNull
  public final LinearLayout content2;

  @NonNull
  public final TextView description;

  @NonNull
  public final ImageView icEye;

  @NonNull
  public final ImageView icLike;

  @NonNull
  public final ImageView icYoutube;

  @NonNull
  public final AppCompatTextView icYoutubeText;

  @NonNull
  public final ImageView icons;

  @NonNull
  public final TextView likeCounter;

  @NonNull
  public final View line;

  @NonNull
  public final TextView onYoutube;

  @NonNull
  public final RelativeLayout subscribe;

  @NonNull
  public final TextView subscribeTxt;

  @NonNull
  public final TextView videoName;

  @NonNull
  public final TextView views;

  private YoutubeBannerBinding(@NonNull FrameLayout rootView, @NonNull TextView ad,
      @NonNull FrameLayout bannerBody, @NonNull RelativeLayout bannerProgress,
      @NonNull LinearLayout content1, @NonNull LinearLayout content2, @NonNull TextView description,
      @NonNull ImageView icEye, @NonNull ImageView icLike, @NonNull ImageView icYoutube,
      @NonNull AppCompatTextView icYoutubeText, @NonNull ImageView icons,
      @NonNull TextView likeCounter, @NonNull View line, @NonNull TextView onYoutube,
      @NonNull RelativeLayout subscribe, @NonNull TextView subscribeTxt,
      @NonNull TextView videoName, @NonNull TextView views) {
    this.rootView = rootView;
    this.ad = ad;
    this.bannerBody = bannerBody;
    this.bannerProgress = bannerProgress;
    this.content1 = content1;
    this.content2 = content2;
    this.description = description;
    this.icEye = icEye;
    this.icLike = icLike;
    this.icYoutube = icYoutube;
    this.icYoutubeText = icYoutubeText;
    this.icons = icons;
    this.likeCounter = likeCounter;
    this.line = line;
    this.onYoutube = onYoutube;
    this.subscribe = subscribe;
    this.subscribeTxt = subscribeTxt;
    this.videoName = videoName;
    this.views = views;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static YoutubeBannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static YoutubeBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.youtube_banner, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static YoutubeBannerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ad;
      TextView ad = ViewBindings.findChildViewById(rootView, id);
      if (ad == null) {
        break missingId;
      }

      FrameLayout bannerBody = (FrameLayout) rootView;

      id = R.id.banner_progress;
      RelativeLayout bannerProgress = ViewBindings.findChildViewById(rootView, id);
      if (bannerProgress == null) {
        break missingId;
      }

      id = R.id.content_1;
      LinearLayout content1 = ViewBindings.findChildViewById(rootView, id);
      if (content1 == null) {
        break missingId;
      }

      id = R.id.content_2;
      LinearLayout content2 = ViewBindings.findChildViewById(rootView, id);
      if (content2 == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.ic_eye;
      ImageView icEye = ViewBindings.findChildViewById(rootView, id);
      if (icEye == null) {
        break missingId;
      }

      id = R.id.ic_like;
      ImageView icLike = ViewBindings.findChildViewById(rootView, id);
      if (icLike == null) {
        break missingId;
      }

      id = R.id.ic_youtube;
      ImageView icYoutube = ViewBindings.findChildViewById(rootView, id);
      if (icYoutube == null) {
        break missingId;
      }

      id = R.id.ic_youtubeText;
      AppCompatTextView icYoutubeText = ViewBindings.findChildViewById(rootView, id);
      if (icYoutubeText == null) {
        break missingId;
      }

      id = R.id.icons;
      ImageView icons = ViewBindings.findChildViewById(rootView, id);
      if (icons == null) {
        break missingId;
      }

      id = R.id.like_counter;
      TextView likeCounter = ViewBindings.findChildViewById(rootView, id);
      if (likeCounter == null) {
        break missingId;
      }

      id = R.id.line;
      View line = ViewBindings.findChildViewById(rootView, id);
      if (line == null) {
        break missingId;
      }

      id = R.id.onYoutube;
      TextView onYoutube = ViewBindings.findChildViewById(rootView, id);
      if (onYoutube == null) {
        break missingId;
      }

      id = R.id.subscribe;
      RelativeLayout subscribe = ViewBindings.findChildViewById(rootView, id);
      if (subscribe == null) {
        break missingId;
      }

      id = R.id.subscribe_txt;
      TextView subscribeTxt = ViewBindings.findChildViewById(rootView, id);
      if (subscribeTxt == null) {
        break missingId;
      }

      id = R.id.video_name;
      TextView videoName = ViewBindings.findChildViewById(rootView, id);
      if (videoName == null) {
        break missingId;
      }

      id = R.id.views;
      TextView views = ViewBindings.findChildViewById(rootView, id);
      if (views == null) {
        break missingId;
      }

      return new YoutubeBannerBinding((FrameLayout) rootView, ad, bannerBody, bannerProgress,
          content1, content2, description, icEye, icLike, icYoutube, icYoutubeText, icons,
          likeCounter, line, onYoutube, subscribe, subscribeTxt, videoName, views);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}