package com.binary_studio.dependency_detector;

import java.util.List;

public final class DependencyDetector {

	private DependencyDetector() {
	}

	public static boolean canBuild(DependencyList libraries) {
		List<String> librariesList = libraries.libraries;
		List<String[]> libraryDependenciesList = libraries.dependencies;

		int librariesListSize = librariesList.size();
		int dependenciesListSize = libraryDependenciesList.size();

		if (librariesListSize>0 && dependenciesListSize>0){
			for (int i = 0; i < dependenciesListSize; i++) {
				for (String[] strings : libraryDependenciesList) {
					if (libraryDependenciesList.get(i)[0].equals(strings[1]))
						return false;
				}
			}
		}
		return true;
	}

	}

