package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

/**
 * Unit test on Neighbour service
 */
@RunWith(JUnit4.class)
public class NeighbourServiceTest {

    private NeighbourApiService service;

    @Before
    public void setup() {
        service = DI.getNewInstanceApiService();
    }

    @Test
    public void getNeighboursWithSuccess() {
        List<Neighbour> neighbours = service.getNeighbours();
        List<Neighbour> expectedNeighbours = DummyNeighbourGenerator.DUMMY_NEIGHBOURS;
        assertThat(neighbours, IsIterableContainingInAnyOrder.containsInAnyOrder(expectedNeighbours.toArray()));
    }

    @Test
    public void getAndSetFavouritesWithSuccess() {

        // We construct a list with the neighbours we will set as favorites
        List<Neighbour> expectedFavourites = new ArrayList<>();
        expectedFavourites.add(service.getNeighbours().get(2));
        expectedFavourites.add(service.getNeighbours().get(4));

        // We set as favorite neighbour 2 and 4
        service.getNeighbours().get(2).setFavorite(true);
        service.getNeighbours().get(4).setFavorite(true);

        // We create a new list, that's where we test the getter
        List<Neighbour> favourites = service.getFavoriteNeighbours();

        assertThat(favourites, IsIterableContainingInAnyOrder.containsInAnyOrder(expectedFavourites.toArray()));
    }

    @Test
    public void deleteNeighbourWithSuccess() {
        Neighbour neighbourToDelete = service.getNeighbours().get(0);
        service.deleteNeighbour(neighbourToDelete);
        assertFalse(service.getNeighbours().contains(neighbourToDelete));
    }

}
