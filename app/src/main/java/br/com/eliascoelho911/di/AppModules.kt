package br.com.eliascoelho911.di

import br.com.eliascoelho911.repository.GitRepository
import br.com.eliascoelho911.retrofit.GitRetrofit
import br.com.eliascoelho911.ui.viewmodel.UserDetailsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val retrofitModule = module {
    single { GitRetrofit() }
}

val repositoryModule = module {
    single { GitRepository() }
}

val viewModelModule = module {
    viewModel { UserDetailsViewModel() }
}