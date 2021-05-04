package br.com.jeancsanchez.chucknorrisapp

import br.com.jeancsanchez.chucknorrisapp.data.Repository
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainViewModelTest {

    private lateinit var repository: Repository
    private lateinit var mainViewModel: MainViewModel

    @Before
    fun setUp() {
        mainViewModel = MainViewModel(repository)
    }
}