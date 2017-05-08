package com.andrzejcompany.dagger2tutorial;

import com.squareup.picasso.Picasso;
import com.andrzejcompany.dagger2tutorial.network.GithubService;

import dagger.Component;

@GithubApplicationScope
@Component(modules = {GithubServiceModule.class, PicassoModule.class, ActivityModule.class})
public interface GithubApplicationComponent {

    Picasso getPicasso();

    GithubService getGithubService();
}
